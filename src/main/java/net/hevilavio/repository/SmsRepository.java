package net.hevilavio.repository;

import net.hevilavio.model.Sms;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by hevilavio on 10/6/15.
 */
public interface SmsRepository extends CrudRepository <Sms, Long> {
}
