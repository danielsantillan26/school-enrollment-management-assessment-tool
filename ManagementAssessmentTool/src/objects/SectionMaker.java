package objects;

public class SectionMaker {

	private static Section[] sections;
	
	
	public static void makeSections() {
		sections = new Section[7];
		
		sections[0] = new Section("1 - Mission Alignment");
		sections[0].addQuestion("Does the school's enrollment strategy clearly "
				+ "reflect and promote its Catholic identity and values?");
		sections[0].addQuestion("Are the school's charism, liturgical life, "
				+ "and religious formation communicated meaningfully to "
				+ "prospective families?");
		sections[0].addQuestion("Are faith-based elements (e.g., sacraments, "
				+ "daily prayer, service, moral development) consistently "
				+ "highlighted in promotional materials?");
		sections[0].setMeanings(new String[] {"Catholic identity is unclear or"
				+ " under-commmunicated", "Some Catholic elements included, but"
						+ " inconsistently emphasized", "Strong, mission-center"
								+ "ed messaging in all outreach"});
		
		sections[1] = new Section("2 - Data and Enrollment Analytics");
		sections[1].addQuestion("Does the school track key data points such as"
				+ " inquiries, tours, applications, acceptances, and"
				+ " enrollment?");
		sections[1].addQuestion("Are demographic shifts and trends in the"
				+ " parish and surrounding community taken into account when"
				+ " planning?");
		sections[1].addQuestion("Are student retention and re-enrollment data"
				+ " analyzed by grade level and family profile?");
		sections[1].setMeanings(new String[] {"No systeem for tracking or using"
				+ " enrollment data", "Some data tracked, but lacks strategic"
						+ " integration", "Comprehensive data analysis informs"
								+ " decisions"});
		
		sections[2] = new Section("3 - Marketing and Communications");
		sections[2].addQuestion("Is there a clear and consistent message about"
				+ " the school's Catholic mission and educational value?");
		sections[2].addQuestion("Is the school's website, social media, and"
				+ " digital presence engaging, current, and family-friendly?");
		sections[2].addQuestion("Are current families, parishioners, and alumni"
				+ " directly involved in promoting the school?");
		sections[2].addQuestion("Is the school's reputation being monitored and"
				+ " enhanced through strategic communication?");
		sections[2].setMeanings(new String[] {"No clear marketing strategy; out"
				+ "dated or inconsistent communication", "Some strategies in pl"
						+ "ace, but lack coordination", "Strategic, mission-dri"
								+ "ven, and community-supported marketing"});
		
		sections[3] = new Section("4 - Admissions Process");
		sections[3].addQuestion("Is the admissions process welcoming, "
				+ "family-centered, and relective of the school's Catholic "
				+ "mission?");
		sections[3].addQuestion("Are opportunities such as school tours, open"
				+ " houses, and classroom visits available and effective?");
		sections[3].addQuestion("Are tuition, financial aid, and scholarship"
				+ " options clearly explained to prospective families?");
		sections[3].setMeanings(new String[] {"Process is unclear or unwelcoming"
				, "Basic process exists but lacks personaization or clarity", 
				"Accessible, welcomig, and mission-reflective admissions "
				+ "process"});
		
		sections[4] = new Section("5 - Family Retention and Student Experience");
		sections[4].addQuestion("Is family and student satisfaction monitored "
				+ "e.g., surveys, check-ins, parent meetings)?");
		sections[4].addQuestion("Are students supported and nurtured spiritual"
				+ "ly, socially, and academically in alignment with Catholic"
				+ " values?");
		sections[4].addQuestion("Are exit interviews or surveys conducted when"
				+ " families choose to leave?");
		sections[4].setMeanings(new String[] {"No proactive monitoring or suppo"
				+ "rt for families", "Some retention efforts exist, but not str"
						+ "ategic", "Strong culture of care and feedback suppo"
								+ "rts retention"});
		
		sections[5] = new Section("6 - Affordability and Tuition Assistance");
		sections[5].addQuestion("Is tuition assistance actively communicated as"
				+ " part of the school's outreach?");
		sections[5].addQuestion("Are there partnerships with parishes, diocesan"
				+ " programs, or benefactors to support financial aid?");
		sections[5].addQuestion("Is the financial aid process transparent, "
				+ "timely, and respectful of family needs?");
		sections[5].setMeanings(new String[] {"Tuition support is unclear or "
				+ "inaccessible", "Some aid options exist but are not well-"
						+ "publicized", "Strong, transparent, and "
								+ "mission-aligned affordability plan"});
		
		sections[6] = new Section("7 - Parish and Community Engagement");
		sections[6].addQuestion("Does the school maintain strong, collaborative"
				+ " relationships with its parish(es)?");
		sections[6].addQuestion("Are the pastor, DRE, and other parish staff i"
				+ "nvolved in outreach, school events, and student formation?");
		sections[6].addQuestion("Are school families encouraged to participate "
				+ "in parish life (e.g., Mass, sacraments, ministries?");
		sections[6].setMeanings(new String[] {"Weak or minimal parish-school co"
				+ "llaboration", "Some connections exist, but need straightenin"
						+ "g", "Virbrant partnership with active parish involvement"});
	}


	public static Section[] getSections() {
		return sections;
	}
	
}
