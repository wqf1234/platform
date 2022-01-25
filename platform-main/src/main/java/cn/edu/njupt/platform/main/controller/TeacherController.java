package cn.edu.njupt.platform.main.controller;

import cn.edu.njupt.platform.main.common.RestResult;
import cn.edu.njupt.platform.main.service.TeacherService;
import cn.edu.njupt.platform.model.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 老师相关controller
 * @author: zhangjia
 * @title: TeacherController
 * @date 2022/1/25 9:41 下午
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final static Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/get")
    public RestResult<Teacher> get(@RequestParam(defaultValue = "0")  int id) {
        logger.info("/teacher/get param id: {}", id);
        final Teacher teacher = teacherService.get(id);
        return RestResult.ok(teacher);
    }

    @PostMapping("/insert")
    public RestResult<Teacher> insert(@RequestBody Teacher teacher) {
        logger.info("/teacher/insert param teacher: {}", teacher);
        teacherService.insert(teacher);
        return RestResult.ok(teacher);
    }
}
