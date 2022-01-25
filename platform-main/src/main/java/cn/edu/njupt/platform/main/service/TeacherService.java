package cn.edu.njupt.platform.main.service;

import cn.edu.njupt.platform.meta.TeacherMapper;
import cn.edu.njupt.platform.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @description: 老师service逻辑
 * @author: zhangjia
 * @title: TeacherService
 * @date 2022/1/25 9:50 下午
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher get(int id) {
        if (id <= 0) {
            throw new RuntimeException("老师的id不能小于0");
        }
        final Teacher teacher = teacherMapper.get(id);
        if (teacher == null) {
            throw new RuntimeException("当前id无对应的老师");
        }
        teacher.setName(teacher.getName() + "老师");
        return teacher;
    }

    public void insert(Teacher teacher) {
        if (teacher.getName() != null && teacher.getName().equals("")) {
            throw new RuntimeException("老师姓名不能为空");
        }

        if (teacher.getEmail() != null && teacher.getEmail().equals("")) {
            throw new RuntimeException("老师邮箱不能为空");
        }
        teacherMapper.insert(teacher);
    }
}
