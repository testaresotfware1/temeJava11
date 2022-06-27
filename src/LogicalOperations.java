public class LogicalOperations {
    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }
    

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";

    }
      public String verifyText(String textInput) {
          if (textInput.equals("FastTrack")) {
              return ("Learning text comparison");

          } else if (!textInput.equals("FastTrack")) {
              return "“Got to try some more”";
          }
          return "00";
      }


}
