import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest_ {
    FizzBuzz fizzBuzz = new FizzBuzz();

    public void should_return_number_when_it_recieves_non_3_or_5_multiple(){

        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    public void should_return_fizz_when_it_receives_3_multple(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    public void should_return_fizz_when_it_receives_5_multple(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Fizz");
    }

    public static class FizzBuzz{
        public String of(int i){
            if(is3Multiple(i)){
                return "Flizz";
            }
            if(is5Multiple(i)){
                return "Flizz";
            }
            return String.valueOf(i);

        }

        private boolean is5Multiple(int i) {
            return i % 5 == 0;
        }

        private boolean is3Multiple(int i) {
            return i % 3 == 0;
        }
    }


}
