package core.repositories;

import java.util.ArrayList;

import core.database.abstracts.DatabaseManager;
import core.general_providers.InstanceManager;
import core.models.abstracts.User;
import core.models.concretes.Transcript;
import core.models.concretes.Course;

public class TranscriptRepository{
    private DatabaseManager databaseManager;
    private String path;

    public TranscriptRepository(){
        databaseManager= InstanceManager.getInstance().getDataBaseInstance();

    }

    public Transcript getTranscript(String transcript){
        
        return null;
    }

    public ArrayList<Course> getCoursesForSemesterByStudent(User user){

        return null;
    }

    public void updateTranscript(User user, ArrayList<Course> courseList){

    }
}
