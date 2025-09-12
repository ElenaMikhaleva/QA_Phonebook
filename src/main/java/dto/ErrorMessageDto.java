package dto;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ErrorMessageDto {

    private String timestamp;
    private int status;
    private String error;
    private Map<String, String> message;
    private String path;

}
