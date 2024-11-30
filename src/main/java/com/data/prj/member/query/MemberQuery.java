package com.data.prj.member.query;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberQuery {
    @Value("${collection.board_collection}")
    private String tbBoardCollection;
    private final MongoTemplate mongoTemplate;

    public List<Document> getMemberList() {
        MatchOperation matchOperation = Aggregation.match(Criteria.where("metadataLocal.userId").is("abc"));

        Aggregation aggregation = Aggregation.newAggregation(
                matchOperation
        );
        AggregationResults<Document> results = mongoTemplate.aggregate(aggregation, "TB_TEST_COLLECTION", Document.class);

        return results.getMappedResults();
    }
}
