package org.launchcode.techjobs_oo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job job;

    @Before
    public void createJobObject() {
        job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job job2 = new Job();
        assertFalse(job.getId() == job2.getId());

    }

    @Test
    public void testConstructor() {
        assertEquals("Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {

        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job2));
    }

    @Test
    public void testTBlankLineBeforeAndAfterToStringMethod() {

        assertTrue(job.toString().charAt(0) == '\n');
        assertEquals(job.toString().charAt(job.toString().length() - 1), '\n');
    }

    @Test
    public void testLabelIdToStringMethod() {
        assertTrue(job.toString().contains("ID"));
    }

    @Test
    public void testLabelNameToStringMethod() {
        assertTrue(job.toString().contains("Name"));
    }

    @Test
    public void testLabelEmployerToStringMethod() {
        assertTrue(job.toString().contains("Employer"));
    }
    @Test
    public void testLabelLocationToStringMethod() {
        assertTrue(job.toString().contains("Location"));
    }
    @Test
    public void testLabelToStringPositionTypeMethod() {
        assertTrue(job.toString().contains("Position Type"));
    }
    @Test
    public void testLabelCoreCompetencyToStringMethod() {
        assertTrue(job.toString().contains("Core Competency"));
    }

    @Test
    public void testIfFieldIsEmptyToStringMethod(){
      Job emptyField = new Job("", new Employer("ACME"), null, null, null);
        assertTrue(emptyField.toString().contains("Data not available"));
    }

    @Test
    public void testIfAllFieldsAreNullToStringMethod(){
        Job emptyField = new Job(null, null, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(emptyField.toString().contains("Data not available"));
    }

    @Test
    public void testIfObjectOnlyContainsIDToStringMethod(){
        Job onlyId = new Job();
        assertTrue(onlyId.toString().contains("OOPS! This job does not seem to exist"));
    }

}