package cn.edu.njupt.platform.meta;

import cn.edu.njupt.platform.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 老师mapper层
 * @author: zhangjia
 * @title: TeacherMapper
 * @date 2022/1/25 9:56 下午
 */
@Mapper
public interface TeacherMapper {
    Teacher get(int id);

    void insert(Teacher teacher);
}
