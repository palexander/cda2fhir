package tr.com.srdc.cda2fhir;

import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.primitive.IdDt;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;

/**
 * Created by mustafa on 8/3/2016.
 */
public interface CCDATransformer {

    enum IdGeneratorEnum {
        COUNTER, UUID
    }

    void setIdGenerator(IdGeneratorEnum idGen);

    String getUniqueId();

    IdDt getPatientId();

    Bundle transformCCD(ContinuityOfCareDocument ccd);
}