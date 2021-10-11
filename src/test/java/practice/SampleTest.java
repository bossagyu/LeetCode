package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
  @Test
  public void addTest(){
    Sample sample = new Sample();
    assertEquals(2,sample.add(1,1));

  }

}