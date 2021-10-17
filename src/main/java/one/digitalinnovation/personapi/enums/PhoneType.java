package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter //criar getters and setters
@AllArgsConstructor //criar construtor automatico
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");
    private final String description;
}
