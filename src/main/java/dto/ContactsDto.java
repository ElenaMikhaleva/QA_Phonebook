package dto;

import lombok.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ContactsDto {

    private Contact[] contacts;
}
