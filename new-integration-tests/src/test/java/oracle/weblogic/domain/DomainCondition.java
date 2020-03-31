// Copyright (c) 2020, Oracle Corporation and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package oracle.kubernetes.weblogic.domain.model;

import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import oracle.kubernetes.json.Description;
import oracle.kubernetes.utils.SystemClock;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;

import static oracle.kubernetes.weblogic.domain.model.ObjectPatch.createObjectPatch;

@Description("DomainCondition contains details for the current condition of this domain.")
public class DomainCondition {

  @Description(
      "The type of the condition. Valid types are Progressing, "
          + "Available, and Failed. Required.")
  private String type;

  @Description("Last time we probed the condition.")
  private DateTime lastProbeTime;

  @Description("Last time the condition transitioned from one status to another.")
  private DateTime lastTransitionTime;

  @Description("Human-readable message indicating details about last transition.")
  private String message;

  @Description("Unique, one-word, CamelCase reason for the condition's last transition.")
  private String reason;

  @Description("Status is the status of the condition. Can be True, False, Unknown. Required.")
  private String status;

  public DomainCondition type(String type) {
    this.type = type;
    return this;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DomainCondition lastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  public DateTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public DomainCondition withLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  public DomainCondition lastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public DomainCondition message(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
    return this;
  }

  public DomainCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DomainCondition status(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public String setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("type", type)
        .append("lastProbeTime", lastProbeTime)
        .append("lastTransitionTime", lastTransitionTime)
        .append("message", message)
        .append("reason", reason)
        .append("status", status)
        .toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(type)
        .append(lastProbeTime)
        .append(lastTransitionTime)
        .append(reason)
        .append(message)
        .append(status)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof DomainCondition)) {
      return false;
    }
    DomainCondition rhs = ((DomainCondition) other);
    return new EqualsBuilder()
        .append(type, rhs.type)
        .append(lastProbeTime, rhs.lastProbeTime)
        .append(lastTransitionTime, rhs.lastTransitionTime)
        .append(reason, rhs.reason)
        .append(message, rhs.message)
        .append(status, rhs.status)
        .isEquals();
  }

}
