package org.goodpeoplegoodtimes.domain.dto.party.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.goodpeoplegoodtimes.domain.constant.Category;
import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyUpdateForm {
    private Long partyId;
    private String title;
    private String content;
    private Category category;
    private int totalPartyMembers;
    private String date;
    private String time;
    private String place;

}