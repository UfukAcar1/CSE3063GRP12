package core.repositories;

import java.util.ArrayList;

import core.database.abstracts.DatabaseManager;
import core.enums.ApprovalState;
import core.general_providers.InstanceManager;
import core.models.concretes.CourseEnrollment;

public class CourseEnrollmentRepository{
    private DatabaseManager databaseManager;
    private String path;
    public CourseEnrollmentRepository(){

    }
    public CourseEnrollment getCourseEnrollmentByStudentId(String id){
        databaseManager= InstanceManager.getInstance().getDataBaseInstance();
        return null;
    }

    public ArrayList<CourseEnrollment> getPendingEnrollments(){

        return null;
    }

    public void updateEnrollment(String studentId, ApprovalState approvalState){

    }
}