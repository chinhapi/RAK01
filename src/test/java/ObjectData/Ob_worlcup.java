package ObjectData;

import java.util.List;

public class Ob_worlcup {
    private String name;
    private List<Round> rounds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public static class Round{
        private String name;
        private List<Match> matches;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Match> getMatches() {
            return matches;
        }

        public void setMatches(List<Match> matches) {
            this.matches = matches;
        }
    }
    public static class Match{
        private String num;
        private String date;
        private String time;
        private Team1 team1 =new Team1();
        private Team2 team2 = new Team2();
        private String score1;
        private String score2;
        private String score1i;
        private String score2i;
        private List<Goals1> goals1;
        private List<Goals2> goals2;
        private String group;
        private Stadium stadium = new Stadium();
        private String city;
        private String timezone;

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Team1 getTeam1() {
            return team1;
        }

        public void setTeam1(Team1 team1) {
            this.team1 = team1;
        }

        public Team2 getTeam2() {
            return team2;
        }

        public void setTeam2(Team2 team2) {
            this.team2 = team2;
        }

        public String getScore1() {
            return score1;
        }

        public void setScore1(String score1) {
            this.score1 = score1;
        }

        public String getScore2() {
            return score2;
        }

        public void setScore2(String score2) {
            this.score2 = score2;
        }

        public String getScore1i() {
            return score1i;
        }

        public void setScore1i(String score1i) {
            this.score1i = score1i;
        }

        public String getScore2i() {
            return score2i;
        }

        public void setScore2i(String score2i) {
            this.score2i = score2i;
        }


        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public Stadium getStadium() {
            return stadium;
        }

        public void setStadium(Stadium stadium) {
            this.stadium = stadium;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }
    }
    public static class Goals1{
        private String name;
        private String minute;
        private String score1;
        private String score2;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMinute() {
            return minute;
        }

        public void setMinute(String minute) {
            this.minute = minute;
        }

        public String getScore1() {
            return score1;
        }

        public void setScore1(String score1) {
            this.score1 = score1;
        }

        public String getScore2() {
            return score2;
        }

        public void setScore2(String score2) {
            this.score2 = score2;
        }
    }
    public static class Goals2{
        private String name;
        private String minute;
        private String score1;
        private String score2;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMinute() {
            return minute;
        }

        public void setMinute(String minute) {
            this.minute = minute;
        }

        public String getScore1() {
            return score1;
        }

        public void setScore1(String score1) {
            this.score1 = score1;
        }

        public String getScore2() {
            return score2;
        }

        public void setScore2(String score2) {
            this.score2 = score2;
        }
    }
    public static class Team1{
        private String name;
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
    public static class Team2{
        private String name;
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
    public static class Stadium{
        private String key;
        private String name;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
