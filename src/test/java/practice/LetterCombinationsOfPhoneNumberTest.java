package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfPhoneNumberTest {
  private LetterCombinationsOfPhoneNumber lnumber;

  @BeforeEach
  public void init() {
    this.lnumber = new LetterCombinationsOfPhoneNumber();
  }

  @Test
  public void Test1(){
    String input = "23";
    String[] expected = {"ad","ae","af","bd","be","bf","cd","ce","cf"};

    assertEquals(Arrays.asList(expected), lnumber.letterCombinations(input));
  }

}