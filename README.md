# Spring-Project

***HOPE YOU CLICK A STAR:star::star::star:***

**In this project, you need to implement a system which can crawl data from websites can display them in the front end. Your front end should communicate with the back end and send a request, then the back end will give the front end feedback.**

- We suggest you follow the  `MVC (Model–view–controller) ` design pattern, which is used for developing user interfaces that divide the related program logic into three interconnected elements. This is done to separate internal representations of information from the ways information is presented to and accepted from the user.
- Also, you can learn by yourself how to design `spring-boot` layers, you can refer to this [link](https://zhuanlan.zhihu.com/p/96753678) for more information.

****

**This part will explain how this demo work.**

1. In `src/main/resources/static/index.html`, it is the entrance of front end. When you enter `localhost:8084` (you can change 8084 to other port in file `Spring-Project/application.yml`), the browser would open `index.html`. In the `script` part of this `html`, it send a `url: /repo/getInfo2` to the back end, and then display the response from back end.

2. When the back end received the url request, more detailed in `RepoController.java`, back end would process `@GetMapping("/getInfo2")`, and you can see the following part would return response to front end.

3. `@GetMapping("/getInfo2")` is the most simple example of communication between frond end and back end. However, it is not so elegant. When you project is more complex or has more codes to maintain, it is really a bad idea to just use controller. We highly suggest you follow the `MVC` pattern, where you can refer to`@GetMapping("/getInfo1")`, which is followed more strict design idea:

   **controller gets the url**

   $\Downarrow$

   **interface executes the abstract method**

   $\Downarrow$

   **interface-implementation runs the real method**

   $\Downarrow$

   **most time you would return an object in domain/entity layer**

*However, we would not grade for how you design you project, but a kind suggestion is that you should keep to these good habit and clean codes.*

****

What's more, to reduce your workload, we do not add database requirement in our project. However, one of `spring-boot's` advantages is its interaction with database. You can add `postgresql` or `mysql`, with the aid of `Mybatis` or `Hibernate`. There are several ways to connect the database, you can explore by yourself.

Also, there are lots of tricks, like `Lombok` and `Swagger`, which would greatly help you during development. If you want to implement more elaborate front end, we suggest `thymeleaf`, `vue-cli`, `bootstrap`, `react`, `element-ui`, etc. Nevertheless, you should look for their communication with back end, once you master one technique, it would be convenient for future study.

****

If you have any question, feel free to leave an issue.
