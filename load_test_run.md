# Load Test Execution Steps

## Tool Used

* Postman Performance Runner

## Objective

To evaluate the performance of the API endpoint under load and collect key performance metrics.

## Environment Setup

1. Install Postman.
2. Create a new Collection.
3. Create a GET request for the target API endpoint.
4. Save the request to the collection.
5. Verify the API returns a successful response.
6. Open the Postman Performance Runner.

## Test Execution

1. Select the collection containing the API request.
2. Open Performance Testing.
3. Configure the required virtual users and test duration.
4. Start the performance test.
5. Allow the test to run for the configured duration.
6. Monitor the execution through the Postman dashboard.

## Metrics Collected

The following performance metrics were collected from the Postman Performance Dashboard:

* Average Response Time - 101ms
* Minimum Response Time - 52ms
* Maximum Response Time - 620ms
* p90 / p95 Response Time - 155ms
* Requests Per Second (Throughput) - 30,000
* Number of Failed Requests - 248.21
* Error Rate (%) - 0.02

## Result Analysis

After the test execution completed, the Postman dashboard automatically generated performance statistics and charts. The collected metrics were analyzed to determine the API's responsiveness, stability, throughput, and error behavior under the specified load conditions.

## Final Observation

Based on the performance test results, the API behavior was evaluated using response time, throughput, and error metrics. The final assessment was prepared using the statistics provided by the Postman Performance Runner dashboard.
