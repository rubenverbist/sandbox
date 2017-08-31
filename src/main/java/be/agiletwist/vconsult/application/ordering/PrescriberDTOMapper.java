package be.agiletwist.vconsult.application.ordering;

import be.agiletwist.vconsult.domain.Prescriber;
import org.springframework.stereotype.Component;

@Component
public class PrescriberDTOMapper {
    public PrescriberDTO map(Prescriber prescriber){
        PrescriberDTO prescriberDTO = new PrescriberDTO();
        prescriberDTO.setName(prescriber.getName());
        prescriberDTO.setNumber(prescriber.getDoctorNumber().getValue());
        return prescriberDTO;
    }
}
