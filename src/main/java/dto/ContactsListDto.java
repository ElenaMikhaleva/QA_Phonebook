package dto;

import lombok.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ContactsListDto {

    private Contact[] contacts;

}
