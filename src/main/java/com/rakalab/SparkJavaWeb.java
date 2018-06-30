package com.rakalab;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import spark.Spark;

public class SparkJavaWeb {

    @Getter
    @Setter
    @AllArgsConstructor
    static class UserData {
        int id;
        String name;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Spark.get("/hello",
                (req, res) -> new UserData(1, req.queryParams("name")),
                gson::toJson);

    }
}
