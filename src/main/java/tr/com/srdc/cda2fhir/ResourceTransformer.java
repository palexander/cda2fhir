package tr.com.srdc.cda2fhir;

import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import org.openhealthtools.mdht.uml.cda.consol.PatientRole;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;

/**
 * Created by mustafa on 7/28/2016.
 */
public interface ResourceTransformer {

    Patient PatientRole2Patient(PatientRole patRole);

    Condition ProblemConcernAct2Condition(ProblemConcernAct probAct);

    Observation ResultObservation2Observation(ResultObservation resObs);

    Observation VitalSignObservation2Observation(VitalSignObservation vsObs);
}