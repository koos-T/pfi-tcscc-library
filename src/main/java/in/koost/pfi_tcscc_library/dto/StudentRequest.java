package in.koost.pfi_tcscc_library.dto;

import in.koost.pfi_tcscc_library.models.Student;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequest {


    private String name;

    private String email;

    private String contact;

    private String address;

    public Student toStudent(){
        return Student.builder()
                .name(this.name)
                .email(this.email)
                .contact(this.contact)
                .address(this.address)
                .build();
    }

}
