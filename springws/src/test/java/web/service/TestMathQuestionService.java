package web.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMathQuestionService {

    // Addition tests
    @Test
    public void testAdditionValidNumbers() {
        assertEquals(5.0, MathQuestionService.q1Addition("2", "3"), 0.001);
    }
    
    @Test
    public void testAdditionDecimalNumbers() {
        assertEquals(4.5, MathQuestionService.q1Addition("1.5", "3"), 0.001);
    }
    
    @Test
    public void testAdditionEmptyInput() {
        assertNull(MathQuestionService.q1Addition("", "3"));
    }
    
    @Test
    public void testAdditionInvalidInput() {
        assertNull(MathQuestionService.q1Addition("abc", "3"));
    }

    // Subtraction tests
    @Test
    public void testSubtractionValidNumbers() {
        assertEquals(1.0, MathQuestionService.q2Subtraction("4", "3"), 0.001);
    }
    
    @Test
    public void testSubtractionNegativeResult() {
        assertEquals(-1.0, MathQuestionService.q2Subtraction("2", "3"), 0.001);
    }
    
    @Test
    public void testSubtractionEmptyInput() {
        assertNull(MathQuestionService.q2Subtraction("5", ""));
    }
    
    // Multiplication tests
    @Test
    public void testMultiplicationValidNumbers() {
        assertEquals(6.0, MathQuestionService.q3Multiplication("2", "3"), 0.001);
    }
    
    @Test
    public void testMultiplicationByZero() {
        assertEquals(0.0, MathQuestionService.q3Multiplication("5", "0"), 0.001);
    }
    
    @Test
    public void testMultiplicationInvalidInput() {
        assertNull(MathQuestionService.q3Multiplication("x", "3"));
    }
}