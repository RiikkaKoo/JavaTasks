import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    @Test
    void testConcatenate() {
        StringManipulator strManipulator = new StringManipulator();
        assertEquals("Kilpikonna", strManipulator.concatenate("Kilpi", "konna"));
        assertEquals("nukkuva tiikeri", strManipulator.concatenate("nukkuva ", "tiikeri"));
        assertEquals("pajunKissa", strManipulator.concatenate("pajun", "Kissa"));
        assertEquals(" tyhjät välit", strManipulator.concatenate(" tyhjät", " välit"));
        assertEquals("111  222  333  444  ", strManipulator.concatenate("111  222  ", "333  444  "));
        assertEquals(".pisteet.CAPS", strManipulator.concatenate(".pisteet.", "CAPS"));
        assertEquals("", strManipulator.concatenate("", ""));
        assertEquals(" ", strManipulator.concatenate(" ", ""));
        assertEquals(" ", strManipulator.concatenate("", " "));
    }

    @Test
    void testFindLength() {
        StringManipulator strManipulator = new StringManipulator();
        assertEquals(9, strManipulator.findLength("123456789"));
        assertEquals(18, strManipulator.findLength("  kaksiVäliäAlussa"));
        assertEquals(29, strManipulator.findLength("ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ"));
        assertEquals(0, strManipulator.findLength(""));
        assertEquals(1, strManipulator.findLength(" "));
        assertEquals(5, strManipulator.findLength(" (5) "));
        assertEquals(7, strManipulator.findLength("EKA" + "TOKA"));
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator strManipulator = new StringManipulator();
        assertEquals("123456789", strManipulator.convertToUpperCase("123456789"));
        assertEquals("", strManipulator.convertToUpperCase(""));
        assertEquals(" ", strManipulator.convertToUpperCase(" "));
        assertEquals("PIENETKIRJAIMET", strManipulator.convertToUpperCase("pienetkirjaimet"));
        assertEquals("JOKATOINEN", strManipulator.convertToUpperCase("jOkAtOiNeN"));
        assertEquals("ISOLLA", strManipulator.convertToUpperCase("ISOLLA"));
        assertEquals("TÄMÄ ON ISOLLA JA TÄMÄ PIENELLÄ", strManipulator.convertToUpperCase("TÄMÄ ON ISOLLA" + " ja tämä pienellä"));
        assertEquals("....++++''''&&&", strManipulator.convertToUpperCase("....++++''''&&&"));
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator strManipulator = new StringManipulator();
        assertEquals("123456789", strManipulator.convertToLowerCase("123456789"));
        assertEquals("", strManipulator.convertToLowerCase(""));
        assertEquals(" ", strManipulator.convertToLowerCase(" "));
        assertEquals("isotkirjaimet", strManipulator.convertToLowerCase("ISOTKIRJAIMET"));
        assertEquals("jokatoinen", strManipulator.convertToLowerCase("jOkAtOiNeN"));
        assertEquals("pienellä", strManipulator.convertToLowerCase("pienellä"));
        assertEquals("tämä on isolla ja tämä pienellä", strManipulator.convertToLowerCase("TÄMÄ ON ISOLLA" + " ja tämä pienellä"));
        assertEquals("....++++''''&&&", strManipulator.convertToLowerCase("....++++''''&&&"));
    }

    @Test
    void testContainsSubstring() {
        StringManipulator strManipulator = new StringManipulator();
        assertTrue(strManipulator.containsSubstring("0012345678900","123456789"));
        assertFalse(strManipulator.containsSubstring("AAbbbCCdddEEfff", "CCC")); //No three Cs back to back
        assertFalse(strManipulator.containsSubstring("AAbbbCCdddEEfff", "aa")); //No two lowercase As back to back
        assertTrue(strManipulator.containsSubstring("Tässä on väli","on väli"));
        assertFalse(strManipulator.containsSubstring("Tämä ei onnistu","Tämäeionnistu"));
        assertTrue(strManipulator.containsSubstring("123-ABC","-")); // One character
        assertTrue(strManipulator.containsSubstring("   alussaKolmeVäliä"," alussaKolmeVäliä"));
        assertTrue(strManipulator.containsSubstring("KooKoKoKoo","Ko" + "Ko"));
    }
}
