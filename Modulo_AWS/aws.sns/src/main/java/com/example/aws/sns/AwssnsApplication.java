package com.example.aws.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;

	@SpringBootApplication
	@RestController
	public class AwssnsApplication {

		@Autowired
		private AmazonSNSClient snsClient;

		String TOPIC_ARN = "arn:aws:sns:us-east-1:965934840569:TopicMF";

		@GetMapping("/adddSubscription/{email}")
		public String addSubscription(@PathVariable String email) {
			SubscribeRequest request = new SubscribeRequest(TOPIC_ARN, "email", email);
			snsClient.subscribe(request);
			return "Subscription request is peding. Check your e-mail: " + email;
		}

		@GetMapping("/sendNotification")
		public String publishmessageToTopic() {
			PublishRequest publishRequest = new PublishRequest(TOPIC_ARN, buildEmailBody(), "Notification: Network connectivity issue");
			snsClient.publish(publishRequest);
			return "Notificação enviada com suceso";
		}

		private String buildEmailBody() {
			return "Querido cliente,\n" + "\n" + "\n" + "Pague o que voce deve imediatamente";
		}


		public static void main(String[] args) {
			SpringApplication.run(AwssnsApplication.class, args);
		}

	}