package kr.ed.haebeop.controller;
import kr.ed.haebeop.domain.Classroom;
import kr.ed.haebeop.domain.Student;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.google.gson.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//REST(Representational State Transfer) : 해당 자원의 상태를 주고받는 모든 것
//RESTful API : Json으로 데이터를 주고 받는 api
@RestController
@RequestMapping("/api/")
public class ApiController {

    @GetMapping("api1")
    public Student getStudent() { //RestController의 Get을 활용한 Student 반환
        Student std1 = new Student(101, "박진권", 8);
        return std1;
    }

    @GetMapping("api2") //RestController의 Get을 활용한 Student List 반환
    public ArrayList<Student> getAllStudent() {
        Student std1 = new Student(101, "박진권", 8);
        Student std2 = new Student(102, "신승원", 9);
        Student std3 = new Student(103,"구예진", 10);
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(std1);
        stds.add(std2);
        stds.add(std3);
        return stds;
    }

    @GetMapping("api3") //RestController의 Get을 활용한 Classroom 반환
    public Classroom getClassRoom() {
        Student std1 = new Student(101, "박진권", 8);
        Student std2 = new Student(102, "신승원", 9);
        Student std3 = new Student(103,"구예진", 10);
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(std1);
        stds.add(std2);
        stds.add(std3);
        Classroom team = new Classroom("fullstack", 2, stds);
        return team;
    }

    @PostMapping("api4")//RestController의 Post를 활용한 Student -> JsonString
    public String postStudent(@RequestBody Student std) {
        String response = String.format("<학생 정보>\n이름 : %s\n번호 : %d\n나이 : %d",
                std.getName(), std.getStdNumber(), std.getAge());
        return response;
    }

    @PostMapping("api5") //RestController의 Post를 활용한 Student List -> JsonString
    public String postAllStudent(@RequestBody List<Student> stds) {
        String response = "<학급 정보>\n";
        int i = 1;
        for(Student s : stds) {
            response += String.format("학생%d: 이름 : %s\t번호 : %d\t나이 : %d\n",
                    i, s.getName(), s.getStdNumber(), s.getAge());
            i++;
        }
        return response;
    }

    @PostMapping("api6")    //RestController의 Post를 활용한 Classroom -> JsonString
    public String postClassroom(@RequestBody Classroom team) {
        String response = String.format("<팀 정보>\n학과명 : %s\n반 : %d\n",
                team.getPart(), team.getClassNum());
        int i = 1;
        for (Student s : team.getStudents()) {
            response += String.format("학생%d: 이름 : %s\t번호 : %d\t나이 : %d\n",
                    i, s.getName(), s.getStdNumber(), s.getAge());
            i++;
        }
        return response;
    }

    @PostMapping("api7") //simple-json을 활용한 JsonString -> Student
    public Student convertStringToStudent1(@RequestBody String jsonStr) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);

        Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()),
                jsonObject.get("name").toString(),
                Integer.valueOf(jsonObject.get("age").toString()));
        return std;
    }

    @PostMapping("api8")    // simple-json을 활용한 Student -> JsonString
    public String convertStudentToString1(@RequestBody Student std) {
        JSONObject jsonPlayer = new JSONObject();
        jsonPlayer.put("stdNumber", std.getStdNumber());
        jsonPlayer.put("name", std.getName());
        jsonPlayer.put("age", std.getAge());
        String jsonStr = jsonPlayer.toJSONString();
        return jsonStr;
    }

    @PostMapping("api9") //gson을 활용한 JsonString -> Student
    public Student convertStringToStudent2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Student std = gson.fromJson(jsonStr, Student.class);
        return std;
    }

    @PostMapping("api10") //gson을 활용한 JsonString -> Classroom
    public Classroom convertStringToClassroom2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Classroom team = gson.fromJson(jsonStr, Classroom.class);
        return team;
    }

    @PostMapping("api11")   //gson을 활용한 Classroom -> JsonString
    public String convertClassroomToString2(@RequestBody Classroom team) {
        Gson gson = new Gson();
        String jsonStr = gson.toJson(team);
        return jsonStr;
    }

    @PostMapping("api12")   //jackson을 활용한 JsonString -> Classroom
    public Classroom convertStringToClassroom3(@RequestBody String jsonStr) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> teamMap = objectMapper.readValue(jsonStr, new TypeReference<>(){});
        Classroom team = new Classroom(
                teamMap.get("part").toString(),
                Integer.valueOf(teamMap.get("classNum").toString()),
                (ArrayList<Student>) teamMap.get("students"));
        return team;
    }

    @PostMapping("api13") //jackson을 활용한 Classroom -> JsonString
    public String convertClassroomToString3(@RequestBody Classroom team) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(team);
        return jsonStr;
    }
}
