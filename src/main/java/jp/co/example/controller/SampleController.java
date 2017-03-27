package jp.co.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="root")
public class SampleController {

    @RequestMapping(value="/api/v1/test/{id}", method = RequestMethod.GET)
    public Map<String, String> get(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "get");
        map.put("id", id.toString());
        return map;
    }

    @RequestMapping(value="/api/v1/test/{id}", method = RequestMethod.POST)
    public Map<String, String> post(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "post");
        map.put("id", id.toString());
        return map;
    }

    @RequestMapping(value="/api/v1/test/{id}", method = RequestMethod.PUT)
    public Map<String, String> put(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "put");
        map.put("id", id.toString());
        return map;
    }

    @RequestMapping(value="/api/v1/test/{id}", method = RequestMethod.PATCH)
    public Map<String, String> patch(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "put");
        map.put("id", id.toString());
        return map;
    }

    @RequestMapping(value="/api/v1/test/{id}", method = RequestMethod.DELETE)
    public Map<String, String> delete(@PathVariable("id") Integer id) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "delete");
        map.put("id", id.toString());
        return map;
    }
}
