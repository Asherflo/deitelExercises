package ChapterSeven;

import ChapterSeven.GradeBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GradeBookTest {
    private GradeBook book;
    @BeforeEach
    public void setUp(){
        book = new GradeBook("","");
    }
    @Test
    public void testCanBeCreated(){
        assertNotNull(book);
    }
    @Test
    public void addInstructorNameTest(){
        book.addInstructor("Chibuzor");
        book.addStudentName("Elder Wale");
        assertEquals("Chibuzor",book.getInstructorName());
        assertEquals("Elder Wale",book.getStudentName());
    }
    @Test
    public void testThatGradeBookHasGrades(){
        int result = book.addGrades(new int[]{89,64,29,99,78,54,43,33,21,86,98});
        assertEquals(694, result);
    }
    @Test
    public void findTheStudentWithHighestGrade(){
        int result = book.highestGrade(new int[]{89,64,29,99,78,54,43,33,21,86,98});
        assertEquals(99,result);
    }
    @Test
    public void findTheStudentWIthSmallestGrade() {
        int result = book.smallestGrade(new int[]{89,64,29,99,78,54,43,33,21,86,98});
        System.out.println(result);
        assertEquals(21,result);
    }
    @Test
    public void testToFindTheAverageGrade(){
        int result = book.averageGrade(new int[]{89,64,29,99,78,54,43,33,21,86,98});
        assertEquals(63,result);
    }

}
