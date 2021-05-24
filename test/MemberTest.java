//Jens & August

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

  @Test
  void validateMemberShipOver60() {
    Member member = new Member();
    member.setAge(61);
    String actual1 = member.validateMemberShip();
    assertEquals("SeniorOver60", actual1);
  }

  @Test
  void validateMembershipBetweenFrom18To60() {
    Member member = new Member();
    member.setAge(25);
    String actual1 = member.validateMemberShip();
    assertEquals("Seniorswimmer", actual1);
  }
  
  @Test
  void validateMembershipUnder18() {
    Member member = new Member();
    member.setAge(17);
    String actual1 = member.validateMemberShip();
    assertEquals("Juniorswimmer", actual1);
  }
}