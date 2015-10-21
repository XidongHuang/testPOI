package spreadsheet.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class ScoresDetail {

	@JsonProperty("Attendance")
	private String Attendance;

	@JsonProperty("FirstName")
	private String FirstName;

	@JsonProperty("HomeworkTotal")
	private String HomeworkTotal;

	@JsonProperty("FinalMarks")
	private String FinalMarks;

	@JsonProperty("FinalExam")
	private String FinalExam;

	@JsonProperty("FinalTotal")
	private String FinalTotal;

	@JsonProperty("StudentID")
	private Integer StudentID;

	@JsonProperty("MidtermTotal")
	private String MidtermTotal;

	@JsonProperty("Quiz5")
	private String Quiz5;

	@JsonProperty("Midterm")
	private String Midterm;

	@JsonProperty("CourseTotal")
	private String CourseTotal;

	@JsonProperty("Quiz6")
	private String Quiz6;

	@JsonProperty("Quiz3")
	private String Quiz3;

	@JsonProperty("Quiz4")
	private String Quiz4;

	@JsonProperty("Quiz9")
	private String Quiz9;

	@JsonProperty("Quiz10")
	private String Quiz10;

	@JsonProperty("Quiz7")
	private String Quiz7;

	@JsonProperty("Quiz8")
	private String Quiz8;

	@JsonProperty("Quiz1")
	private String Quiz1;

	@JsonProperty("Surname")
	private String Surname;

	@JsonProperty("Quiz2")
	private String Quiz2;

	@JsonProperty("Homework")
	private String Homework;

	@JsonProperty("QuizTotal")
	private String QuizTotal;

	@JsonProperty("CourseCode")
	private String CourseCode;

	public String getAttendance() {
		return Attendance;
	}

	public void setAttendance(String attendance) {
		Attendance = attendance;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getHomeworkTotal() {
		return HomeworkTotal;
	}

	public void setHomeworkTotal(String homeworkTotal) {
		HomeworkTotal = homeworkTotal;
	}

	public String getFinalMarks() {
		return FinalMarks;
	}

	public void setFinalMarks(String finalMarks) {
		FinalMarks = finalMarks;
	}

	public String getFinalExam() {
		return FinalExam;
	}

	public void setFinalExam(String finalExam) {
		FinalExam = finalExam;
	}

	public String getFinalTotal() {
		return FinalTotal;
	}

	public void setFinalTotal(String finalTotal) {
		FinalTotal = finalTotal;
	}

	public Integer getStudentID() {
		return StudentID;
	}

	public void setStudentID(Integer studentID) {
		StudentID = studentID;
	}

	public String getMidtermTotal() {
		return MidtermTotal;
	}

	public void setMidtermTotal(String midtermTotal) {
		MidtermTotal = midtermTotal;
	}

	public String getQuiz5() {
		return Quiz5;
	}

	public void setQuiz5(String quiz5) {
		Quiz5 = quiz5;
	}

	public String getMidterm() {
		return Midterm;
	}

	public void setMidterm(String midterm) {
		Midterm = midterm;
	}

	public String getCourseTotal() {
		return CourseTotal;
	}

	public void setCourseTotal(String courseTotal) {
		CourseTotal = courseTotal;
	}

	public String getQuiz6() {
		return Quiz6;
	}

	public void setQuiz6(String quiz6) {
		Quiz6 = quiz6;
	}

	public String getQuiz3() {
		return Quiz3;
	}

	public void setQuiz3(String quiz3) {
		Quiz3 = quiz3;
	}

	public String getQuiz4() {
		return Quiz4;
	}

	public void setQuiz4(String quiz4) {
		Quiz4 = quiz4;
	}

	public String getQuiz9() {
		return Quiz9;
	}

	public void setQuiz9(String quiz9) {
		Quiz9 = quiz9;
	}

	public String getQuiz10() {
		return Quiz10;
	}

	public void setQuiz10(String quiz10) {
		Quiz10 = quiz10;
	}

	public String getQuiz7() {
		return Quiz7;
	}

	public void setQuiz7(String quiz7) {
		Quiz7 = quiz7;
	}

	public String getQuiz8() {
		return Quiz8;
	}

	public void setQuiz8(String quiz8) {
		Quiz8 = quiz8;
	}

	public String getQuiz1() {
		return Quiz1;
	}

	public void setQuiz1(String quiz1) {
		Quiz1 = quiz1;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getQuiz2() {
		return Quiz2;
	}

	public void setQuiz2(String quiz2) {
		Quiz2 = quiz2;
	}

	public String getHomework() {
		return Homework;
	}

	public void setHomework(String homework) {
		Homework = homework;
	}

	public String getQuizTotal() {
		return QuizTotal;
	}

	public void setQuizTotal(String quizTotal) {
		QuizTotal = quizTotal;
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}

	public ScoresDetail(String attendance, String firstName, String homeworkTotal, String finalMarks, String finalExam,
			String finalTotal, Integer studentID, String midtermTotal, String quiz5, String midterm, String courseTotal,
			String quiz6, String quiz3, String quiz4, String quiz9, String quiz10, String quiz7, String quiz8,
			String quiz1, String surname, String quiz2, String homework, String quizTotal, String courseCode) {
		super();
		Attendance = attendance;
		FirstName = firstName;
		HomeworkTotal = homeworkTotal;
		FinalMarks = finalMarks;
		FinalExam = finalExam;
		FinalTotal = finalTotal;
		StudentID = studentID;
		MidtermTotal = midtermTotal;
		Quiz5 = quiz5;
		Midterm = midterm;
		CourseTotal = courseTotal;
		Quiz6 = quiz6;
		Quiz3 = quiz3;
		Quiz4 = quiz4;
		Quiz9 = quiz9;
		Quiz10 = quiz10;
		Quiz7 = quiz7;
		Quiz8 = quiz8;
		Quiz1 = quiz1;
		Surname = surname;
		Quiz2 = quiz2;
		Homework = homework;
		QuizTotal = quizTotal;
		CourseCode = courseCode;
	}

	public ScoresDetail() {
		super();
	}

	@Override
	public String toString() {
		return "ScoresDetail [Attendance=" + Attendance + ", FirstName=" + FirstName + ", HomeworkTotal="
				+ HomeworkTotal + ", FinalMarks=" + FinalMarks + ", FinalExam=" + FinalExam + ", FinalTotal="
				+ FinalTotal + ", StudentID=" + StudentID + ", MidtermTotal=" + MidtermTotal + ", Quiz5=" + Quiz5
				+ ", Midterm=" + Midterm + ", CourseTotal=" + CourseTotal + ", Quiz6=" + Quiz6 + ", Quiz3=" + Quiz3
				+ ", Quiz4=" + Quiz4 + ", Quiz9=" + Quiz9 + ", Quiz10=" + Quiz10 + ", Quiz7=" + Quiz7 + ", Quiz8="
				+ Quiz8 + ", Quiz1=" + Quiz1 + ", Surname=" + Surname + ", Quiz2=" + Quiz2 + ", Homework=" + Homework
				+ ", QuizTotal=" + QuizTotal + ", CourseCode=" + CourseCode + "]";
	}

}
