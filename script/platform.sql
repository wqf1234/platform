create table lesson
(
    lesson_id  int auto_increment comment '课程标识，自增id'
        primary key,
    name       char(20)  default ''                not null comment '课程名称',
    teacher_id int       default -1                not null comment '教师id',
    created_at timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updated_at timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '课程' charset = utf8;


create table student
(
    stu_id     int auto_increment comment '学生标识，自增id'
        primary key,
    name       char(20)  default ''                not null comment '学生姓名',
    result     char(50)  default ''                not null comment '学生答题结果',
    stu_score  int       default -1                not null comment '学生所得分数',
    created_at timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updated_at timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '学生' charset = utf8;


create table study
(
    sid        int       default -1                not null comment '学生标识，自增id',
    lid        int       default -1                not null comment '课程标识，自增id',
    created_at timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updated_at timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '学生学习课程' charset = utf8;


create table subject
(
    subject_id int auto_increment comment '题目标识，自增id'
        primary key,
    type       char(10)     default ''                not null comment '题目类型',
    num        int          default -1                not null comment '题目数量',
    content    varchar(100) default ''                not null comment '题目内容',
    answer     varchar(100) default ''                not null comment '题目答案',
    deadline   char(20)     default ''                not null comment '作业截止时间',
    score      int          default -1                not null comment '题目得分',
    created_at timestamp    default CURRENT_TIMESTAMP not null comment '创建时间',
    updated_at timestamp    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '题目' charset = utf8;


create table teacher
(
    tid        int auto_increment comment '老师标识，自增id'
        primary key,
    name       char(20)  default ''                not null comment '老师姓名',
    email      char(50)  default ''                not null comment '老师邮箱',
    created_at timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    updated_at timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '老师' charset = utf8;

