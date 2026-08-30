import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import java.util.List;

@DynamoDbBean
public class departmentRecord {
    private String departmentName;
    private String hodName;
    private List<String> teacherNames;
    private List<String> classGroupNames;

    public departmentRecord() {}

    @DynamoDbPartitionKey
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getHodName() { return hodName; }
    public void setHodName(String hodName) { this.hodName = hodName; }

    public List<String> getTeacherNames() { return teacherNames; }
    public void setTeacherNames(List<String> teacherNames) { this.teacherNames = teacherNames; }

    public List<String> getClassGroupNames() { return classGroupNames; }
    public void setClassGroupNames(List<String> classGroupNames) { this.classGroupNames = classGroupNames; }
}