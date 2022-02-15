import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonalType;
import com.xworkz.passport.constants.VerifiedDocuments;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportServiceImpl;

public class Test {

	public static void main(String[] args) {


		PassportServiceImpl serviceImpl= new PassportServiceImpl();
		
		/*String issuedBy, LocalDateTime issuedAt, LocalDate expiresAt, Gender gender, long passportNo,
		String address, String fullName, boolean legalIssue, PassportPersonalType passportPersonalType, LocalDate dob,
		BloodGroup bloodGroup, VerifiedDocuments verifiedDocument*/
		PassportEntity entity=new PassportEntity("PassportSeva", "", "", 'F', A1256325L, "PassportSevaVibhag NewDelhi", "Passport", false, "", "", "", "");
	}

}
