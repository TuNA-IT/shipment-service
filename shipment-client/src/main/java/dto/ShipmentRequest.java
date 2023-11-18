package dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static constants.Constants.Validate.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ShipmentRequest {
  @NotBlank(message = ADDRESS_NOT_BLANK)
  private String fromAddressId;
  @NotBlank(message = ADDRESS_NOT_BLANK)
  private String toAddressId;
  @DecimalMin(value = "0")
  private Double price;
  @NotBlank(message = SHIPMENT_METHOD_BLANK)
  private String shipmentMethodId;
}