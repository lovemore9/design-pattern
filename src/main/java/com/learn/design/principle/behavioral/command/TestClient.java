package com.learn.design.principle.behavioral.command;

/**
 * 命令模式测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-21 9:46
 * </pre>
 */
public class TestClient {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("课程精讲");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
