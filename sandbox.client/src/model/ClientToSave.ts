import {PhoneDisplay} from "./PhoneDisplay";

export class ClientToSave {
  public id: number;
  public surname: string;
  public name: string;
  public patronymic: string;
  public birthDate: Date;
  public gender: string;
  public characterId: number;
  public streetRegistration: string;
  public houseRegistration: string;
  public apartmentRegistration: string;
  public streetResidence: string;
  public houseResidence: string;
  public apartmentResidence: string;

  public numbers: PhoneDisplay[];

  public static of(a: any): ClientToSave {
    const ret = new ClientToSave();
    ret.assign(a);
    return ret;
  }

  constructor() {
    this.id = null;
    this.surname = "";
    this.name = "";
    this.patronymic = "";
    this.birthDate = null;
    this.gender = "";
    this.characterId = null;
    this.streetRegistration = "";
    this.houseRegistration = "";
    this.apartmentRegistration = "";
    this.streetResidence = "";
    this.houseResidence = "";
    this.apartmentResidence = "";
    this.numbers = [];
    this.numbers.push(new PhoneDisplay())
  }

  assign(a: any) {
    this.id = a.id;
    this.surname = a.surname;
    this.name = a.name;
    this.patronymic = a.patronymic;
    this.birthDate = a.birthDate;
    this.gender = a.gender;
    this.characterId = a.characterId;
    this.streetRegistration = a.streetRegistration;
    this.houseRegistration = a.houseRegistration;
    this.apartmentRegistration = a.apartmentRegistration;
    this.streetResidence = a.streetResidence;
    this.houseResidence = a.houseResidence;
    this.apartmentResidence = a.apartmentResidence;
    this.numbers = a.numbers;
  }
}