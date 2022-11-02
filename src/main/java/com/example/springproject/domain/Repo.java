package com.example.springproject.domain;

public class Repo {
    String name;
    int developerNum;
    int most_active_developer;
    int open_issues;
    int close_issues;
    double issue_solve_average;
    int issue_solve_max_day;
    int issue_solve_min_day;
    int releases;
    int commit_times;
    int releases_top10_commits;
    int releases_commits;

    public Repo(String name, int developerNum, int most_active_developer, int open_issues, int close_issues, double issue_solve_average, int issue_solve_max_day, int issue_solve_min_day, int releases, int commit_times, int releases_top10_commits, int releases_commits) {
        this.name = name;
        this.developerNum = developerNum;
        this.most_active_developer = most_active_developer;
        this.open_issues = open_issues;
        this.close_issues = close_issues;
        this.issue_solve_average = issue_solve_average;
        this.issue_solve_max_day = issue_solve_max_day;
        this.issue_solve_min_day = issue_solve_min_day;
        this.releases = releases;
        this.commit_times = commit_times;
        this.releases_top10_commits = releases_top10_commits;
        this.releases_commits = releases_commits;
    }

    public Repo(){
        this.name = "name";
        this.developerNum = 0;
        this.most_active_developer = 0;
        this.open_issues = 0;
        this.close_issues = 0;
        this.issue_solve_average = 0;
        this.issue_solve_max_day = 0;
        this.issue_solve_min_day = 0;
        this.releases = 0;
        this.commit_times = 0;
        this.releases_top10_commits = 0;
        this.releases_commits = 0;
    }

    public String getName() {
        return name;
    }

    public int getDeveloperNum() {
        return developerNum;
    }

    public int getMost_active_developer() {
        return most_active_developer;
    }

    public int getOpen_issues() {
        return open_issues;
    }

    public int getClose_issues() {
        return close_issues;
    }

    public double getIssue_solve_average() {
        return issue_solve_average;
    }

    public int getIssue_solve_max_day() {
        return issue_solve_max_day;
    }

    public int getIssue_solve_min_day() {
        return issue_solve_min_day;
    }

    public int getReleases() {
        return releases;
    }

    public int getCommit_times() {
        return commit_times;
    }

    public int getReleases_top10_commits() {
        return releases_top10_commits;
    }

    public int getReleases_commits() {
        return releases_commits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloperNum(int developerNum) {
        this.developerNum = developerNum;
    }

    public void setMost_active_developer(int most_active_developer) {
        this.most_active_developer = most_active_developer;
    }

    public void setOpen_issues(int open_issues) {
        this.open_issues = open_issues;
    }

    public void setClose_issues(int close_issues) {
        this.close_issues = close_issues;
    }

    public void setIssue_solve_average(double issue_solve_average) {
        this.issue_solve_average = issue_solve_average;
    }

    public void setIssue_solve_max_day(int issue_solve_max_day) {
        this.issue_solve_max_day = issue_solve_max_day;
    }

    public void setIssue_solve_min_day(int issue_solve_min_day) {
        this.issue_solve_min_day = issue_solve_min_day;
    }

    public void setReleases(int releases) {
        this.releases = releases;
    }

    public void setCommit_times(int commit_times) {
        this.commit_times = commit_times;
    }

    public void setReleases_top10_commits(int releases_top10_commits) {
        this.releases_top10_commits = releases_top10_commits;
    }

    public void setReleases_commits(int releases_commits) {
        this.releases_commits = releases_commits;
    }
}
