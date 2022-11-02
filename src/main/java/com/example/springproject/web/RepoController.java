package com.example.springproject.web;

import com.example.springproject.domain.Repo;
import com.example.springproject.service.RepoService;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/repo")
public class RepoController {

    /**
     * 读取json文件，返回json串
     * @param fileName
     * @return
     */
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }

            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Autowired
    private RepoService repoService;

    @GetMapping("/getInfo1")
    public Repo getInfo_1(){
        return repoService.findInfo();
    }

    @GetMapping("/getInfo2")
    public ArrayList<String> getInfo_2() throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();

        String json = "";

        try {
            BufferedReader in = new BufferedReader(new FileReader("src/temp.json"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
                json = json.concat(str);
            }
//            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }

        Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);

        arrayList.add(""+JsonPath.read(document, "$.repo"));
        arrayList.add(""+JsonPath.read(document, "$.developers"));
        arrayList.add(""+JsonPath.read(document, "$.most_active_developer.login"));
        arrayList.add(""+JsonPath.read(document, "$.open_issues"));
        arrayList.add(""+JsonPath.read(document, "$.close_issues"));

        return arrayList;
    }

}
