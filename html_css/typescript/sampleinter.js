function interfaceAsArgs(person) {
    console.log(person.email);
    console.log(person.name);
}
var personArg = {
    name: "testname"
};
interfaceAsArgs(personArg);
