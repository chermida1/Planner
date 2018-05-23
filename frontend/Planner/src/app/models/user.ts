import { Role } from './role';

export class User {
    public userId: number;
    public firstname: string;
    public lastname: string;
    public password: string;
    public email: string;
    public role: Role;
    public phoneNumber: string;

    constructor(userId: number, firstname: string, lastname: string, password: string, email: string,
        role: Role, phoneNumber: string) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.role = role;
        this.phoneNumber = phoneNumber;

    }
}
