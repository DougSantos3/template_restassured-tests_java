import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.internal.HttpStatus
import org.springframework.cloud.contract.spec.internal.MediaTypes

Contract.make {
    request {
        method 'GET'
        url '/user/1'
    }
    response {
        status HttpStatus.OK()
        body([
                id: 1,
                name: "John Doe",
                email: "john.doe@example.com"
        ])
        headers {
            contentType(MediaTypes.APPLICATION_JSON())
        }
    }
}
