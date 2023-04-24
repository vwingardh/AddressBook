function getAddresses(element) {
    fetch("http://localhost:8080/addresses")
        .then((response) => response.json())
        .then((data) => {
            const addressList = document.createElement("div");

            for (let i = 0; i < data.length; i++) {
                const address = data[i];
                const addressNameDiv = document.createElement("div");
                addressNameDiv.setAttribute("class", "address-name");
                addressNameDiv.textContent = `${address.firstName} ${address.lastName}`;

                addressStreetDiv = document.createElement("div");
                addressStreetDiv.setAttribute("class", "address-street");
                addressStreetDiv.textContent = `${address.addressLine1}, ${address.addressLine2}`;

                addressCityDiv = document.createElement("div");
                addressCityDiv.textContent = `${address.city}, ${address.country} ${address.postalCode}`;

                addressList.appendChild(addressNameDiv);
                addressList.appendChild(addressStreetDiv);
                addressList.appendChild(addressCityDiv);
            }
            element.appendChild(addressList);
        })
        .catch((error) => console.error(error));
}

document.addEventListener("DOMContentLoaded", () => {
    const mainElement = document.querySelector("main");
    getAddresses(mainElement);
});
