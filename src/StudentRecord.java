import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import java.util.Map;

@DynamoDbBean
public class StudentRecord {
    private String studentId;
    private String name;
    private String classGroup;
    private Map<String, Integer> scores;
    private String password;

    public StudentRecord() {}

    @DynamoDbPartitionKey
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClassGroup() { return classGroup; }
    public void setClassGroup(String classGroup) { this.classGroup = classGroup; }

    public Map<String, Integer> getScores() { return scores; }
    public void setScores(Map<String, Integer> scores) { this.scores = scores; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}