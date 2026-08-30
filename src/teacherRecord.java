import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import java.util.List;

@DynamoDbBean
public class teacherRecord {
    private String teacherId;
    private String name;
    private List<String> subjectsTaught;   // just subject names, flattened

    public teacherRecord() {}

    @DynamoDbPartitionKey
    public String getTeacherId() { return teacherId; }
    public void setTeacherId(String teacherId) { this.teacherId = teacherId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getSubjectsTaught() { return subjectsTaught; }
    public void setSubjectsTaught(List<String> subjectsTaught) { this.subjectsTaught = subjectsTaught; }
}
