package by.overone.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    private static Main main;

    @BeforeAll
    public static void setUp(){
        main = new Main();
    }


    @Disabled("because it's in task")
    @ParameterizedTest
    @ValueSource(strings ={""})
    void isStringEmptySuccessful(String str){
        assertTrue(main.isStringEmpty(str));
    }


    @ParameterizedTest
    @ValueSource(strings ={"hi"})
    void isStringEmptyUnSuccessful(String str){
        assertFalse(main.isStringEmpty(str));
    }


    @DisplayName("CHANGE STRING")
    @RepeatedTest(7)
    void changeStringSuccessful(){
        String str = "  apple ";
        System.out.println("Repeated test");
        assertEquals("%pple", main.changeString(str));
    }


    @ParameterizedTest
    @ValueSource(strings ={"hi dear friends"})
    void getNumberWordsSuccessful(String str){
        assertEquals(3, main.getNumberWords(str));
    }


    @Disabled
    @ParameterizedTest
    @ValueSource(strings ={"hi friends"})
    void getNumberWordsUnSuccessful(String str){
        assertNotEquals(3, main.getNumberWords(str));
    }

}