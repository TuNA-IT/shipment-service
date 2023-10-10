package com.ncsgroup.shipment.server.dto.shipmentmethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentMethodPageResponse {
    private List<ShipmentMethodResponse> shipmentMethodResponseList;
    private int count;
}