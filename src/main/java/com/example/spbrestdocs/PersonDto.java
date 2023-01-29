package com.example.spbrestdocs;


import java.time.LocalDate;

public class PersonDto {

    public static class Response {
        private Long id;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private Gender gender;
        private String hobby;


        public Response(Long id, String firstName, String lastName, LocalDate birthDate, Gender gender, String hobby) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.gender = gender;
            this.hobby = hobby;
        }


        public static Builder builder(){
            return new Builder();
        }

        public static class Builder {
            private Long id;
            private String firstName;
            private String lastName;
            private LocalDate birthDate;
            private Gender gender;
            private String hobby;
            public Builder id(Long id) {
                this.id = id;
                return this;
            }
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public Builder birthDate(LocalDate birthDate) {
                this.birthDate = birthDate;
                return this;
            }
            public Builder gender(Gender gender) {
                this.gender = gender;
                return this;
            }
            public Builder hobby(String hobby) {
                this.hobby = hobby;
                return this;
            }
            public Response build() {
                return new Response(id, firstName, lastName, birthDate, gender, hobby);
            }
        }


    }






    public static class Update {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }
    }
}
