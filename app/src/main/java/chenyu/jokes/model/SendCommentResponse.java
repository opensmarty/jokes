package chenyu.jokes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.parceler.Parcel;

/**
 * Created by chenyu on 2017/5/16.
 */

@Parcel @JsonIgnoreProperties(ignoreUnknown = true) public class SendCommentResponse {
  public Comment data;
}
