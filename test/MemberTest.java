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
  void validateMembershipSenior() {
    Member member = new Member();
  }
}