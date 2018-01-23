package com.Castle.Week1;

public class Main {

    public static void main(String[] args) {

        int [] averageHightemps = {45, 29, 10, 22, 41, 28, 33};
        double [] averagePrecipitation = {.95, .60, .25, .05, .0, .75, .90};

        String monday = "Monday's forecast is going to be a high of 45 degrees and precipitation will be 95%";
        String tuesday = "Tuesday's forecast is going to be a high of 29 degrees and precipitation will be 60%";
        String wednesday = "Wednesday's forecast is going to be a high of 10 degrees and precipitation will be 25%";
        String thursday = "Thursday's forecast is going to be a high of 22 degrees and precipitation will be 5%";
        String friday = "Friday's forecast is going to be a high of 41 degrees and precipitation will be 0%";
        String saturday = "Saturday's forecast is going to be a high of 28 degrees and precipitation will be 75%";
        String sunday = "Sunday's forecast is going to be a high of 33 degrees and precipitation will be 90%";
        if (averageHightemps[0] <= 32 && averagePrecipitation[0] > .50)
            System.out.println(monday);
        if (averageHightemps[1] <= 32 && averagePrecipitation[1] > .50)
            System.out.println(tuesday);
        if (averageHightemps[2] <= 32 && averagePrecipitation[2] > .50)
            System.out.println(wednesday);
        if (averageHightemps[3] <= 32 && averagePrecipitation[3] > .50)
            System.out.println(thursday);
        if (averageHightemps[4] <= 32 && averagePrecipitation[4] > .50)
            System.out.println(friday);
        if (averageHightemps[5] <= 32 && averagePrecipitation[5] > .50)
            System.out.println(saturday);
        if (averageHightemps[6] <= 32 && averagePrecipitation[6] > .50)
            System.out.println(sunday);

    }
}
