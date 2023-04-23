function getAddresses(element) {
    fetch("http://localhost:8080/addresses")
        .then((response) => response.json())
        .then((data) => {
            const addressList = document.createElement("div");

            for (let i = 0; i < data.length; i++) {
                const address = data[i];
                const addressDiv = document.createElement("div");
                addressDiv.textContent = `${address.firstName} ${address.lastName}, ${address.addressLine1}, ${address.addressLine2}, ${address.postalCode}, ${address.city}, ${address.country}`;
                addressList.appendChild(addressDiv);
            }
            element.appendChild(addressList);
        })
        .catch((error) => console.error(error));
}

document.addEventListener("DOMContentLoaded", () => {
    const mainElement = document.querySelector("main");
    getAddresses(mainElement);
});

